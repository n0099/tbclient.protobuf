package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AgreeList extends Message {
    @ProtoField(tag = 8)
    public final User agreeer;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_del;
    @ProtoField(tag = 9)
    public final Post post_info;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_DEL = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_ID = 0L;

    private AgreeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_info = builder.thread_info;
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.is_del == null) {
                this.is_del = DEFAULT_IS_DEL;
            } else {
                this.is_del = builder.is_del;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            this.agreeer = builder.agreeer;
            this.post_info = builder.post_info;
            return;
        }
        this.thread_info = builder.thread_info;
        this.time = builder.time;
        this.is_del = builder.is_del;
        this.type = builder.type;
        this.id = builder.id;
        this.agreeer = builder.agreeer;
        this.post_info = builder.post_info;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AgreeList> {
        public User agreeer;
        public Long id;
        public Integer is_del;
        public Post post_info;
        public ThreadInfo thread_info;
        public Integer time;
        public Integer type;

        public Builder() {
        }

        public Builder(AgreeList agreeList) {
            super(agreeList);
            if (agreeList != null) {
                this.thread_info = agreeList.thread_info;
                this.time = agreeList.time;
                this.is_del = agreeList.is_del;
                this.type = agreeList.type;
                this.id = agreeList.id;
                this.agreeer = agreeList.agreeer;
                this.post_info = agreeList.post_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgreeList build(boolean z) {
            return new AgreeList(this, z);
        }
    }
}
