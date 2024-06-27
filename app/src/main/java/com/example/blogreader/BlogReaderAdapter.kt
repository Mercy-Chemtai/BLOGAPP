package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogReaderAdapter (var blogList:List<Blog>):
RecyclerView.Adapter<BlogViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_of_blogs,parent,false)
            return  BlogViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
            val blog = blogList[position]
            holder.title.text = blog.title
            holder.text.text = blog.text
            holder.link.text = blog.link
            holder.author1.text = blog.author1
            holder.author2.text = blog.author1
            holder.publishement.text = blog.publishment
        }

        override fun getItemCount(): Int {
            return  blogList.size
        }
    }



    class BlogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var title = itemView.findViewById<TextView>(R.id.tvTitle)
        var text = itemView.findViewById<TextView>(R.id.tvText)
        var link = itemView.findViewById<TextView>(R.id.tvLink)
        var author1 = itemView.findViewById<TextView>(R.id.tvMonique)
        var author2= itemView.findViewById<TextView>(R.id.tvPola)
        var publishement = itemView.findViewById<TextView>(R.id.tvpublishment)




    }



