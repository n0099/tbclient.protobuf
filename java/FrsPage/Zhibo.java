package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Zhibo extends Message {
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_lpost;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer int1;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer lpost_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_FORUM = 0L;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_INT1 = 0;
    public static final Integer DEFAULT_HAS_LPOST = 0;
    public static final Integer DEFAULT_LPOST_TYPE = 0;

    /* synthetic */ Zhibo(Builder builder, boolean z, Zhibo zhibo) {
        this(builder, z);
    }

    private Zhibo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum == null) {
                this.forum = DEFAULT_FORUM;
            } else {
                this.forum = builder.forum;
            }
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.int1 == null) {
                this.int1 = DEFAULT_INT1;
            } else {
                this.int1 = builder.int1;
            }
            if (builder.has_lpost == null) {
                this.has_lpost = DEFAULT_HAS_LPOST;
            } else {
                this.has_lpost = builder.has_lpost;
            }
            if (builder.lpost_type == null) {
                this.lpost_type = DEFAULT_LPOST_TYPE;
                return;
            } else {
                this.lpost_type = builder.lpost_type;
                return;
            }
        }
        this.forum = builder.forum;
        this.tid = builder.tid;
        this.status = builder.status;
        this.type = builder.type;
        this.int1 = builder.int1;
        this.has_lpost = builder.has_lpost;
        this.lpost_type = builder.lpost_type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Zhibo> {
        public Long forum;
        public Integer has_lpost;
        public Integer int1;
        public Integer lpost_type;
        public Integer status;
        public Long tid;
        public Integer type;

        public Builder() {
        }

        public Builder(Zhibo zhibo) {
            super(zhibo);
            if (zhibo != null) {
                this.forum = zhibo.forum;
                this.tid = zhibo.tid;
                this.status = zhibo.status;
                this.type = zhibo.type;
                this.int1 = zhibo.int1;
                this.has_lpost = zhibo.has_lpost;
                this.lpost_type = zhibo.lpost_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zhibo build(boolean z) {
            return new Zhibo(this, z, null);
        }
    }
}
