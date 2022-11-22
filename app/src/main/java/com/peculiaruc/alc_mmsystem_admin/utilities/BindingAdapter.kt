package com.peculiaruc.alc_mmsystem_admin.utilities

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.ChipGroup
import com.peculiaruc.alc_mmsystem_admin.R
import com.peculiaruc.alc_mmsystem_admin.type.ProgramProgress
import com.peculiaruc.alc_mmsystem_admin.type.TaskStatus
import com.peculiaruc.alc_mmsystem_admin.ui.base.BaseAdapter
import com.peculiaruc.alc_mmsystem_admin.ui.dialogs.DialogTypes

@BindingAdapter(value = ["checkedChipButtonId"])
fun setCheckedChipId(view: ChipGroup?, id: Int) {
    if (id != view?.checkedChipId) {
        view?.check(id)
    }
}

@InverseBindingAdapter(attribute = "checkedChipButtonId", event = "checkedChipButtonId")
fun getChipId(view: ChipGroup?): Int? {
    return view?.checkedChipId
}

@BindingAdapter("checkedChipButtonId")
fun setChipsListener(view: ChipGroup?, attChange: InverseBindingListener) {
    view?.setOnCheckedStateChangeListener { group, checkedId ->
        attChange.onChange()
    }
}

@BindingAdapter("app:showIfID")
fun showIfID(view: View, id: Int?) {
    view.isVisible = id?.let {
        when (it) {
            R.id.chip_certificates,
            R.id.chip_tasks,
            R.id.chip_mentors,
            R.id.chip_program,
            R.id.chip_reports -> {
                true
            }
            else -> {
                false
            }
        }
    } ?: false
}

@BindingAdapter("app:showTaskBar")
fun showTaskBar(view: TextView, id: Int?) {
    view.isVisible = id?.let {
        when (it) {
            R.id.chip_tasks -> {
                view.text = view.context.getString(R.string.all_tasks)
                true
            }
            R.id.chip_program -> {
                view.text = view.context.getString(R.string.all_programs)
                true
            }
            R.id.chip_reports -> {
                view.text = view.context.getString(R.string.all_reports)
                true
            }
            else -> {
                false
            }
        }
    } ?: false
}

@BindingAdapter("app:showSearchIcon")
fun showSearchIcon(view: View, id: Int?) {
    view.isVisible = id?.let {
        when (it) {
            R.id.chip_tasks,
            R.id.chip_mentors,
            R.id.chip_program,
            R.id.chip_reports -> {
                true
            }
            else -> {
                false
            }
        }
    } ?: false
}


@BindingAdapter("app:showTaskSearchBar")
fun showTaskSearchBar(view: View, id: Int?) {
    view.isVisible = id?.let {
        it == R.id.chip_tasks
    } ?: false
}

@BindingAdapter("app:showTaskStatus")
fun showTaskStatus(view: View, status: TaskStatus?) {
    if (status != null && status != TaskStatus.ASSIGN) {
        view.isClickable = false
        view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.mms_green_11))
    } else {
        view.isClickable = true
        view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.white))
    }
}


@BindingAdapter("app:programIcon")
fun showProgramIcon(view: ImageView, progress: ProgramProgress?) {
    progress?.let {
        when (it) {
            ProgramProgress.ADD -> {
                view.setBackgroundResource(R.drawable.add_circle_plus_1)
            }
            ProgramProgress.DOUBLE_CHECK -> {
                view.setBackgroundResource(R.drawable.double_check)
            }
            ProgramProgress.CHECK -> {
                view.setBackgroundResource(R.drawable.check_icon)
            }
        }
    }
}

@BindingAdapter("app:setTaskStatus")
fun setTaskStatus(view: TextView, status: TaskStatus?) {
    status?.let {
        val taskStatus = when (status) {
            TaskStatus.ASSIGN -> {
                view.setTextColor(ContextCompat.getColor(view.context, R.color.mms_pry_4))
                view.context.getString(R.string.task_assign)
            }
            TaskStatus.ASSIGNED -> {
                view.setTextColor(ContextCompat.getColor(view.context, R.color.mms_black_5))
                view.context.getString(R.string.task_assigned)
            }
            TaskStatus.COMPLETED -> {
                view.setTextColor(ContextCompat.getColor(view.context, R.color.mms_black_5))
                view.context.getString(R.string.task_completed)
            }
        }
        view.text = taskStatus
    }
}


@BindingAdapter("app:showWhenEmptyList")
fun <T> showWhenEmptyList(view: View, list: List<T>?) {
    view.isVisible = list.isNullOrEmpty()
}

@BindingAdapter("app:showWhenListNotEmpty")
fun <T> showWhenListNotEmpty(view: View, list: List<T>?) {
    view.isVisible = !list.isNullOrEmpty()
}

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    (view.adapter as BaseAdapter<T>?)?.setItems(items ?: emptyList())
}

@BindingAdapter("app:dialogTitle")
fun setDialogTitle(textView: TextView, types: DialogTypes?) {
    types?.let {
        val title = when (types) {
            DialogTypes.SAVED_PROFILE -> R.string.dialog_profile_title
            DialogTypes.ASSIGNED_TO_PROGRAM -> R.string.dialog_assigned_program
            DialogTypes.UNASSIGNED_TO_PROGRAM -> R.string.dialog_unassigned_program
            DialogTypes.ASSIGNED_TO_MENTOR -> R.string.dialog_assigned_mentor
            DialogTypes.UNASSIGNED_TO_MENTOR -> R.string.dialog_unassigned_mentor
            DialogTypes.ASSIGNED_TASK -> R.string.dialog_assigned_task
            DialogTypes.UNASSIGNED_TASK -> R.string.dialog_unassigned_task
            DialogTypes.REPORT_DOWNLOAD -> R.string.dialog_download
            DialogTypes.CERTIFICATE_DOWNLOAD -> R.string.dialog_certificate_downloaded
            DialogTypes.DELETE_MENTOR_MANGER -> R.string.dialog_delete
            DialogTypes.SHARE_REPORT -> R.string.dialog_share_report
        }
        textView.text = textView.context.getString(title)
    }
}

@BindingAdapter("app:dialogIcon")
fun setDialogTitle(imageView: ImageView, types: DialogTypes?) {
    types?.let {
        val image = when (types) {
            DialogTypes.SAVED_PROFILE,
            DialogTypes.REPORT_DOWNLOAD -> R.drawable.success_icon
            DialogTypes.UNASSIGNED_TO_PROGRAM,
            DialogTypes.UNASSIGNED_TO_MENTOR,
            DialogTypes.UNASSIGNED_TASK -> R.drawable.unassign_program_icon
            DialogTypes.ASSIGNED_TO_PROGRAM -> R.drawable.assigned_program
            DialogTypes.ASSIGNED_TO_MENTOR,
            DialogTypes.ASSIGNED_TASK -> R.drawable.assigned_task_icon
            DialogTypes.CERTIFICATE_DOWNLOAD -> R.drawable.download_dialog_icon
            DialogTypes.DELETE_MENTOR_MANGER -> R.drawable.delete_icon
            DialogTypes.SHARE_REPORT -> R.drawable.share_report_icon
        }
        imageView.setImageResource(image)
    }

}

@BindingAdapter("app:isVisible")
fun setVisibility(view: View, isVisible: Boolean) {
    view.isVisible = isVisible
}

@BindingAdapter("app:mentorMangerButton")
fun setMentorMangerButtonText(view: Button, doneSend: Boolean?) {
    doneSend?.let {
        val title = if (doneSend) {
            R.string.button_done
        } else {
            R.string.button_send
        }
        view.text = view.context.getText(title)
    }
}


@BindingAdapter("app:textFirstActionButton")
fun setTextFirstActionButton(view: Button, type: DialogTypes?) {
    type?.let {
        val title = if (type == DialogTypes.SHARE_REPORT) {
            R.string.button_open_email
        } else {
            R.string.button_done
        }
        view.text = view.context.getText(title)
    }
}

@BindingAdapter("app:textSecondActionButton")
fun setTextSecondActionButton(view: Button, type: DialogTypes?) {
    type?.let {
        val title = if (type == DialogTypes.SHARE_REPORT) {
            R.string.button_cancel
        } else {
            R.string.button_undo
        }
        view.text = view.context.getText(title)
    }
}