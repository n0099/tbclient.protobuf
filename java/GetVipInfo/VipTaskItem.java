package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipTaskItem extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer task_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_TASK_ID = 0;
    public static final Integer DEFAULT_IS_FINISH = 0;

    private VipTaskItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = builder.task_id;
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
            if (builder.is_finish == null) {
                this.is_finish = DEFAULT_IS_FINISH;
                return;
            } else {
                this.is_finish = builder.is_finish;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.task_id = builder.task_id;
        this.title = builder.title;
        this.desc = builder.desc;
        this.link = builder.link;
        this.is_finish = builder.is_finish;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipTaskItem> {
        public String desc;
        public String img_url;
        public Integer is_finish;
        public String link;
        public Integer task_id;
        public String title;

        public Builder() {
        }

        public Builder(VipTaskItem vipTaskItem) {
            super(vipTaskItem);
            if (vipTaskItem != null) {
                this.img_url = vipTaskItem.img_url;
                this.task_id = vipTaskItem.task_id;
                this.title = vipTaskItem.title;
                this.desc = vipTaskItem.desc;
                this.link = vipTaskItem.link;
                this.is_finish = vipTaskItem.is_finish;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipTaskItem build(boolean z) {
            return new VipTaskItem(this, z);
        }
    }
}
