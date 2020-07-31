package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class RecommendForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_ST_PARAM = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer member_num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String st_param;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer thread_num;
    public static final Integer DEFAULT_MEMBER_NUM = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;

    private RecommendForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.st_param == null) {
                this.st_param = "";
            } else {
                this.st_param = builder.st_param;
            }
            if (builder.member_num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = builder.member_num;
            }
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = builder.thread_num;
                return;
            }
        }
        this.name = builder.name;
        this.avatar = builder.avatar;
        this.link = builder.link;
        this.st_param = builder.st_param;
        this.member_num = builder.member_num;
        this.thread_num = builder.thread_num;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<RecommendForum> {
        public String avatar;
        public String link;
        public Integer member_num;
        public String name;
        public String st_param;
        public Integer thread_num;

        public Builder() {
        }

        public Builder(RecommendForum recommendForum) {
            super(recommendForum);
            if (recommendForum != null) {
                this.name = recommendForum.name;
                this.avatar = recommendForum.avatar;
                this.link = recommendForum.link;
                this.st_param = recommendForum.st_param;
                this.member_num = recommendForum.member_num;
                this.thread_num = recommendForum.thread_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForum build(boolean z) {
            return new RecommendForum(this, z);
        }
    }
}
