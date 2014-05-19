package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class RecommendForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_ST_PARAM = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String st_param;

    /* synthetic */ RecommendForum(Builder builder, boolean z, RecommendForum recommendForum) {
        this(builder, z);
    }

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
                return;
            } else {
                this.st_param = builder.st_param;
                return;
            }
        }
        this.name = builder.name;
        this.avatar = builder.avatar;
        this.link = builder.link;
        this.st_param = builder.st_param;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<RecommendForum> {
        public String avatar;
        public String link;
        public String name;
        public String st_param;

        public Builder(RecommendForum recommendForum) {
            super(recommendForum);
            if (recommendForum != null) {
                this.name = recommendForum.name;
                this.avatar = recommendForum.avatar;
                this.link = recommendForum.link;
                this.st_param = recommendForum.st_param;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForum build(boolean z) {
            return new RecommendForum(this, z, null);
        }
    }
}
