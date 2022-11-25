package com.peculiaruc.alc_mmsystem_admin.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_admin.databinding.ItemSearchCertificateBinding
import com.peculiaruc.alc_mmsystem_admin.databinding.ItemSearchProgramBinding
import com.peculiaruc.alc_mmsystem_admin.databinding.ItemSearchReportBinding
import com.peculiaruc.alc_mmsystem_admin.databinding.ItemSearchTaskBinding
import com.peculiaruc.alc_mmsystem_admin.domain.models.*

enum class ViewType(val value: Int) {
    Task(1), Program(2), Certificate(3), Report(4)
}

class SearchAdapter(
    private val itemsList: List<Item>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            ViewType.Task.value -> {
                val binding = ItemSearchTaskBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return TaskViewHolder(binding)
            }
            ViewType.Program.value -> {
                val binding = ItemSearchProgramBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return ProgramViewHolder(binding)
            }
            ViewType.Certificate.value -> {
                val binding = ItemSearchCertificateBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return CertificateViewHolder(binding)
            }
            ViewType.Report.value -> {
                val binding = ItemSearchReportBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return ReportViewHolder(binding)
            }
            else -> {
                val binding = ItemSearchTaskBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return TaskViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (itemsList[position]) {
            is Task -> {
                (holder as TaskViewHolder).bind(itemsList[position] as Task)
            }
            is Program -> {
                (holder as ProgramViewHolder).bind(itemsList[position] as Program)
            }
            is Certificate -> {
                (holder as CertificateViewHolder).bind(itemsList[position] as Certificate)
            }
            is Report -> {
                (holder as ReportViewHolder).bind(itemsList[position] as Report)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemsList[position]) {
            is Task -> ViewType.Task.value
            is Program -> ViewType.Program.value
            is Certificate -> ViewType.Certificate.value
            else -> ViewType.Report.value
        }
        /*        when (position % 4) {
                    0 -> return R.layout.item_search_task
                    1 -> return R.layout.item_search_program
                    2 -> return R.layout.item_search_report
                    3 -> return R.layout.item_search_certificate
                }*/
    }

    companion object ItemDiffCallback : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
//            return oldItem.id == newItem.id
            return true
        }
    }

    class TaskViewHolder(private val binding: ItemSearchTaskBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.apply {
                textTitle.text = (item as Task).title
                textDate.text = item.time
            }
        }
    }

    class ProgramViewHolder(private val binding: ItemSearchProgramBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.textTitle.text = (item as Program).programTitle
        }
    }

    class ReportViewHolder(private val binding: ItemSearchReportBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.apply {
                textTitle.text = (item as Report).title
                textOwner.text = item.author
                textDate.text = item.date
            }
        }
    }

    class CertificateViewHolder(private val binding: ItemSearchCertificateBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.apply {
                textTitle.text = (item as Certificate).title
            }
        }
    }

    override fun getItemCount(): Int = itemsList.size

}