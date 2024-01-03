package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CommonInteraction extends Message {
    public static final String DEFAULT_AFTER_CLICK_PIC = "";
    public static final String DEFAULT_BEFORE_CLICK_PIC = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final String DEFAULT_QUES_DESC = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String after_click_pic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String before_click_pic;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_clicked;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ques_desc;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long total_num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long user_pk_id;
    public static final Long DEFAULT_TOTAL_NUM = 0L;
    public static final Integer DEFAULT_HAS_CLICKED = 0;
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Long DEFAULT_USER_PK_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CommonInteraction> {
        public String after_click_pic;
        public String before_click_pic;
        public Integer has_clicked;
        public String module_name;
        public Long pk_id;
        public String ques_desc;
        public Long total_num;
        public Long user_pk_id;

        public Builder() {
        }

        public Builder(CommonInteraction commonInteraction) {
            super(commonInteraction);
            if (commonInteraction == null) {
                return;
            }
            this.module_name = commonInteraction.module_name;
            this.ques_desc = commonInteraction.ques_desc;
            this.total_num = commonInteraction.total_num;
            this.has_clicked = commonInteraction.has_clicked;
            this.before_click_pic = commonInteraction.before_click_pic;
            this.after_click_pic = commonInteraction.after_click_pic;
            this.pk_id = commonInteraction.pk_id;
            this.user_pk_id = commonInteraction.user_pk_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonInteraction build(boolean z) {
            return new CommonInteraction(this, z);
        }
    }

    public CommonInteraction(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            String str2 = builder.ques_desc;
            if (str2 == null) {
                this.ques_desc = "";
            } else {
                this.ques_desc = str2;
            }
            Long l = builder.total_num;
            if (l == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = l;
            }
            Integer num = builder.has_clicked;
            if (num == null) {
                this.has_clicked = DEFAULT_HAS_CLICKED;
            } else {
                this.has_clicked = num;
            }
            String str3 = builder.before_click_pic;
            if (str3 == null) {
                this.before_click_pic = "";
            } else {
                this.before_click_pic = str3;
            }
            String str4 = builder.after_click_pic;
            if (str4 == null) {
                this.after_click_pic = "";
            } else {
                this.after_click_pic = str4;
            }
            Long l2 = builder.pk_id;
            if (l2 == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l2;
            }
            Long l3 = builder.user_pk_id;
            if (l3 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l3;
                return;
            }
        }
        this.module_name = builder.module_name;
        this.ques_desc = builder.ques_desc;
        this.total_num = builder.total_num;
        this.has_clicked = builder.has_clicked;
        this.before_click_pic = builder.before_click_pic;
        this.after_click_pic = builder.after_click_pic;
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
    }
}
