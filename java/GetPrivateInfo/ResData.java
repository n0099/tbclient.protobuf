package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SimpleUser;
/* loaded from: classes7.dex */
public final class ResData extends Message {
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer bazhu_show_inside;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer bazhu_show_outside;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer forum_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer group;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer like;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer live;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer location;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer post;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer reply;
    @ProtoField(tag = 5)
    public final SimpleUser user;
    public static final Integer DEFAULT_LOCATION = 0;
    public static final Integer DEFAULT_POST = 0;
    public static final Integer DEFAULT_LIKE = 0;
    public static final Integer DEFAULT_GROUP = 0;
    public static final Integer DEFAULT_LIVE = 0;
    public static final Integer DEFAULT_FORUM_NUM = 0;
    public static final Integer DEFAULT_REPLY = 0;
    public static final Integer DEFAULT_BAZHU_SHOW_INSIDE = 0;
    public static final Integer DEFAULT_BAZHU_SHOW_OUTSIDE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public Integer bazhu_show_inside;
        public Integer bazhu_show_outside;
        public Integer forum_num;
        public Integer group;
        public Integer like;
        public Integer live;
        public Integer location;
        public Integer post;
        public Integer reply;
        public SimpleUser user;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData == null) {
                return;
            }
            this.location = resData.location;
            this.post = resData.post;
            this.like = resData.like;
            this.group = resData.group;
            this.user = resData.user;
            this.live = resData.live;
            this.forum_num = resData.forum_num;
            this.reply = resData.reply;
            this.bazhu_show_inside = resData.bazhu_show_inside;
            this.bazhu_show_outside = resData.bazhu_show_outside;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z);
        }
    }

    public ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.location;
            if (num == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = num;
            }
            Integer num2 = builder.post;
            if (num2 == null) {
                this.post = DEFAULT_POST;
            } else {
                this.post = num2;
            }
            Integer num3 = builder.like;
            if (num3 == null) {
                this.like = DEFAULT_LIKE;
            } else {
                this.like = num3;
            }
            Integer num4 = builder.group;
            if (num4 == null) {
                this.group = DEFAULT_GROUP;
            } else {
                this.group = num4;
            }
            this.user = builder.user;
            Integer num5 = builder.live;
            if (num5 == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = num5;
            }
            Integer num6 = builder.forum_num;
            if (num6 == null) {
                this.forum_num = DEFAULT_FORUM_NUM;
            } else {
                this.forum_num = num6;
            }
            Integer num7 = builder.reply;
            if (num7 == null) {
                this.reply = DEFAULT_REPLY;
            } else {
                this.reply = num7;
            }
            Integer num8 = builder.bazhu_show_inside;
            if (num8 == null) {
                this.bazhu_show_inside = DEFAULT_BAZHU_SHOW_INSIDE;
            } else {
                this.bazhu_show_inside = num8;
            }
            Integer num9 = builder.bazhu_show_outside;
            if (num9 == null) {
                this.bazhu_show_outside = DEFAULT_BAZHU_SHOW_OUTSIDE;
                return;
            } else {
                this.bazhu_show_outside = num9;
                return;
            }
        }
        this.location = builder.location;
        this.post = builder.post;
        this.like = builder.like;
        this.group = builder.group;
        this.user = builder.user;
        this.live = builder.live;
        this.forum_num = builder.forum_num;
        this.reply = builder.reply;
        this.bazhu_show_inside = builder.bazhu_show_inside;
        this.bazhu_show_outside = builder.bazhu_show_outside;
    }
}
