package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ActivityInfo extends Message {
    public static final String DEFAULT_BACK_PIC = "";
    public static final String DEFAULT_MAIN_TITLE = "";
    public static final String DEFAULT_SUBPAGE_LINK = "";
    public static final String DEFAULT_SUB_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long activity_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String back_pic;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer back_pic_height;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer back_pic_width;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String main_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sub_title;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String subpage_link;
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final Integer DEFAULT_BACK_PIC_WIDTH = 0;
    public static final Integer DEFAULT_BACK_PIC_HEIGHT = 0;

    private ActivityInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.activity_id == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = builder.activity_id;
            }
            if (builder.main_title == null) {
                this.main_title = "";
            } else {
                this.main_title = builder.main_title;
            }
            if (builder.sub_title == null) {
                this.sub_title = "";
            } else {
                this.sub_title = builder.sub_title;
            }
            if (builder.back_pic == null) {
                this.back_pic = "";
            } else {
                this.back_pic = builder.back_pic;
            }
            if (builder.back_pic_width == null) {
                this.back_pic_width = DEFAULT_BACK_PIC_WIDTH;
            } else {
                this.back_pic_width = builder.back_pic_width;
            }
            if (builder.back_pic_height == null) {
                this.back_pic_height = DEFAULT_BACK_PIC_HEIGHT;
            } else {
                this.back_pic_height = builder.back_pic_height;
            }
            if (builder.subpage_link == null) {
                this.subpage_link = "";
                return;
            } else {
                this.subpage_link = builder.subpage_link;
                return;
            }
        }
        this.activity_id = builder.activity_id;
        this.main_title = builder.main_title;
        this.sub_title = builder.sub_title;
        this.back_pic = builder.back_pic;
        this.back_pic_width = builder.back_pic_width;
        this.back_pic_height = builder.back_pic_height;
        this.subpage_link = builder.subpage_link;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ActivityInfo> {
        public Long activity_id;
        public String back_pic;
        public Integer back_pic_height;
        public Integer back_pic_width;
        public String main_title;
        public String sub_title;
        public String subpage_link;

        public Builder() {
        }

        public Builder(ActivityInfo activityInfo) {
            super(activityInfo);
            if (activityInfo != null) {
                this.activity_id = activityInfo.activity_id;
                this.main_title = activityInfo.main_title;
                this.sub_title = activityInfo.sub_title;
                this.back_pic = activityInfo.back_pic;
                this.back_pic_width = activityInfo.back_pic_width;
                this.back_pic_height = activityInfo.back_pic_height;
                this.subpage_link = activityInfo.subpage_link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityInfo build(boolean z) {
            return new ActivityInfo(this, z);
        }
    }
}
