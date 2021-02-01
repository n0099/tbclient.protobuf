package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipSpecialItem extends Message {
    public static final String DEFAULT_BUTTON_TEXT_FINISH = "";
    public static final String DEFAULT_BUTTON_TEXT_INITIAL = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DESC_EXT = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String button_text_finish;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String button_text_initial;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String desc_ext;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer task_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String update_time;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TASK_ID = 0;
    public static final Integer DEFAULT_IS_FINISH = 0;

    private VipSpecialItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.update_time == null) {
                this.update_time = "";
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.desc_ext == null) {
                this.desc_ext = "";
            } else {
                this.desc_ext = builder.desc_ext;
            }
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = builder.task_id;
            }
            if (builder.is_finish == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = builder.is_finish;
            }
            if (builder.button_text_initial == null) {
                this.button_text_initial = "";
            } else {
                this.button_text_initial = builder.button_text_initial;
            }
            if (builder.button_text_finish == null) {
                this.button_text_finish = "";
                return;
            } else {
                this.button_text_finish = builder.button_text_finish;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.title = builder.title;
        this.desc = builder.desc;
        this.link = builder.link;
        this.update_time = builder.update_time;
        this.id = builder.id;
        this.type = builder.type;
        this.desc_ext = builder.desc_ext;
        this.task_id = builder.task_id;
        this.is_finish = builder.is_finish;
        this.button_text_initial = builder.button_text_initial;
        this.button_text_finish = builder.button_text_finish;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipSpecialItem> {
        public String button_text_finish;
        public String button_text_initial;
        public String desc;
        public String desc_ext;
        public Integer id;
        public String img_url;
        public Integer is_finish;
        public String link;
        public Integer task_id;
        public String title;
        public Integer type;
        public String update_time;

        public Builder() {
        }

        public Builder(VipSpecialItem vipSpecialItem) {
            super(vipSpecialItem);
            if (vipSpecialItem != null) {
                this.img_url = vipSpecialItem.img_url;
                this.title = vipSpecialItem.title;
                this.desc = vipSpecialItem.desc;
                this.link = vipSpecialItem.link;
                this.update_time = vipSpecialItem.update_time;
                this.id = vipSpecialItem.id;
                this.type = vipSpecialItem.type;
                this.desc_ext = vipSpecialItem.desc_ext;
                this.task_id = vipSpecialItem.task_id;
                this.is_finish = vipSpecialItem.is_finish;
                this.button_text_initial = vipSpecialItem.button_text_initial;
                this.button_text_finish = vipSpecialItem.button_text_finish;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpecialItem build(boolean z) {
            return new VipSpecialItem(this, z);
        }
    }
}
