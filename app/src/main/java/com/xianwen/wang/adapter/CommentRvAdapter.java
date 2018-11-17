package com.xianwen.wang.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xianwen.wang.R;
import com.xianwen.wang.bean.Comment;
import com.xianwen.wang.bean.User;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.bmob.v3.datatype.BmobFile;

/**
 * 通信卓越151
 * 王先文
 * Email:wangxianwenup@gmail.com
 * 20181112
 *
 */
/*
public class CommentRvAdapter extends BaseQuickAdapter<Comment, BaseViewHolder> {

    private Context context;

    public CommentRvAdapter(Context context, int layoutResId, @Nullable List<Comment> data) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Comment item) {
        User user = item.getUser();
        ImageView sexView = helper.getView(R.id.comment_item_iv_sex);
        if (user.getSex() != null) {
            if (user.getSex() == 0) {
                Picasso.with(context).load(R.mipmap.male).into(sexView);
            } else {
                Picasso.with(context).load(R.mipmap.female).into(sexView);
            }
        }
        ImageView headView = helper.getView(R.id.comment_item_civ_head);
        if (user.getHeadFile() != null) {
            BmobFile headFileFile = user.getHeadFile();
            Picasso.with(context).load(headFileFile.getFileUrl()).into(headView);
        } else {
            Picasso.with(context).load(R.mipmap.ic_head).into(headView);
        }
        helper.setText(R.id.comment_item_tv_name, user.getNickName());
        helper.setText(R.id.comment_item_tv_time, item.getCommentTime());
        helper.setText(R.id.comment_item_tv_content, item.getContent());
    }

}
*/