package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
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
            if (activityInfo == null) {
                return;
            }
            this.activity_id = activityInfo.activity_id;
            this.main_title = activityInfo.main_title;
            this.sub_title = activityInfo.sub_title;
            this.back_pic = activityInfo.back_pic;
            this.back_pic_width = activityInfo.back_pic_width;
            this.back_pic_height = activityInfo.back_pic_height;
            this.subpage_link = activityInfo.subpage_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityInfo build(boolean z) {
            return new ActivityInfo(this, z);
        }
    }

    public ActivityInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.activity_id;
            if (l == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l;
            }
            String str = builder.main_title;
            if (str == null) {
                this.main_title = "";
            } else {
                this.main_title = str;
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str2;
            }
            String str3 = builder.back_pic;
            if (str3 == null) {
                this.back_pic = "";
            } else {
                this.back_pic = str3;
            }
            Integer num = builder.back_pic_width;
            if (num == null) {
                this.back_pic_width = DEFAULT_BACK_PIC_WIDTH;
            } else {
                this.back_pic_width = num;
            }
            Integer num2 = builder.back_pic_height;
            if (num2 == null) {
                this.back_pic_height = DEFAULT_BACK_PIC_HEIGHT;
            } else {
                this.back_pic_height = num2;
            }
            String str4 = builder.subpage_link;
            if (str4 == null) {
                this.subpage_link = "";
                return;
            } else {
                this.subpage_link = str4;
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
}
