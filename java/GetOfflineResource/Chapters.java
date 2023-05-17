package tbclient.GetOfflineResource;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Chapters extends Message {
    public static final String DEFAULT_RESOURCE_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer chapter_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer chapter_vip;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer resource_size;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String resource_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_img_num;
    public static final Integer DEFAULT_CHAPTER_ID = 0;
    public static final Integer DEFAULT_RESOURCE_SIZE = 0;
    public static final Integer DEFAULT_TOTAL_IMG_NUM = 0;
    public static final Integer DEFAULT_CHAPTER_VIP = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Chapters> {
        public Integer chapter_id;
        public Integer chapter_vip;
        public Integer resource_size;
        public String resource_url;
        public Integer total_img_num;

        public Builder() {
        }

        public Builder(Chapters chapters) {
            super(chapters);
            if (chapters == null) {
                return;
            }
            this.chapter_id = chapters.chapter_id;
            this.resource_url = chapters.resource_url;
            this.resource_size = chapters.resource_size;
            this.total_img_num = chapters.total_img_num;
            this.chapter_vip = chapters.chapter_vip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Chapters build(boolean z) {
            return new Chapters(this, z);
        }
    }

    public Chapters(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.chapter_id;
            if (num == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
            } else {
                this.chapter_id = num;
            }
            String str = builder.resource_url;
            if (str == null) {
                this.resource_url = "";
            } else {
                this.resource_url = str;
            }
            Integer num2 = builder.resource_size;
            if (num2 == null) {
                this.resource_size = DEFAULT_RESOURCE_SIZE;
            } else {
                this.resource_size = num2;
            }
            Integer num3 = builder.total_img_num;
            if (num3 == null) {
                this.total_img_num = DEFAULT_TOTAL_IMG_NUM;
            } else {
                this.total_img_num = num3;
            }
            Integer num4 = builder.chapter_vip;
            if (num4 == null) {
                this.chapter_vip = DEFAULT_CHAPTER_VIP;
                return;
            } else {
                this.chapter_vip = num4;
                return;
            }
        }
        this.chapter_id = builder.chapter_id;
        this.resource_url = builder.resource_url;
        this.resource_size = builder.resource_size;
        this.total_img_num = builder.total_img_num;
        this.chapter_vip = builder.chapter_vip;
    }
}
