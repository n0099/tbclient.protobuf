package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AgreeList extends Message {
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_VIRTUAL_IMAGE_URL = "";
    @ProtoField(tag = 8)
    public final User agreeer;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_del;
    @ProtoField(tag = 9)
    public final Post post_info;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer snapshoot_pic_id;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String target_scheme;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String virtual_image_url;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_DEL = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_SNAPSHOOT_PIC_ID = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AgreeList> {
        public User agreeer;
        public Long id;
        public Integer is_del;
        public Post post_info;
        public Integer snapshoot_pic_id;
        public String target_scheme;
        public ThreadInfo thread_info;
        public Integer time;
        public Integer type;
        public String virtual_image_url;

        public Builder() {
        }

        public Builder(AgreeList agreeList) {
            super(agreeList);
            if (agreeList == null) {
                return;
            }
            this.thread_info = agreeList.thread_info;
            this.time = agreeList.time;
            this.is_del = agreeList.is_del;
            this.type = agreeList.type;
            this.id = agreeList.id;
            this.agreeer = agreeList.agreeer;
            this.post_info = agreeList.post_info;
            this.virtual_image_url = agreeList.virtual_image_url;
            this.snapshoot_pic_id = agreeList.snapshoot_pic_id;
            this.target_scheme = agreeList.target_scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgreeList build(boolean z) {
            return new AgreeList(this, z);
        }
    }

    public AgreeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_info = builder.thread_info;
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            Integer num2 = builder.is_del;
            if (num2 == null) {
                this.is_del = DEFAULT_IS_DEL;
            } else {
                this.is_del = num2;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            this.agreeer = builder.agreeer;
            this.post_info = builder.post_info;
            String str = builder.virtual_image_url;
            if (str == null) {
                this.virtual_image_url = "";
            } else {
                this.virtual_image_url = str;
            }
            Integer num4 = builder.snapshoot_pic_id;
            if (num4 == null) {
                this.snapshoot_pic_id = DEFAULT_SNAPSHOOT_PIC_ID;
            } else {
                this.snapshoot_pic_id = num4;
            }
            String str2 = builder.target_scheme;
            if (str2 == null) {
                this.target_scheme = "";
                return;
            } else {
                this.target_scheme = str2;
                return;
            }
        }
        this.thread_info = builder.thread_info;
        this.time = builder.time;
        this.is_del = builder.is_del;
        this.type = builder.type;
        this.id = builder.id;
        this.agreeer = builder.agreeer;
        this.post_info = builder.post_info;
        this.virtual_image_url = builder.virtual_image_url;
        this.snapshoot_pic_id = builder.snapshoot_pic_id;
        this.target_scheme = builder.target_scheme;
    }
}
