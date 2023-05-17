package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
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

    /* loaded from: classes10.dex */
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
            if (zhibo == null) {
                return;
            }
            this.forum = zhibo.forum;
            this.tid = zhibo.tid;
            this.status = zhibo.status;
            this.type = zhibo.type;
            this.int1 = zhibo.int1;
            this.has_lpost = zhibo.has_lpost;
            this.lpost_type = zhibo.lpost_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zhibo build(boolean z) {
            return new Zhibo(this, z);
        }
    }

    public Zhibo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum;
            if (l == null) {
                this.forum = DEFAULT_FORUM;
            } else {
                this.forum = l;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            Integer num3 = builder.int1;
            if (num3 == null) {
                this.int1 = DEFAULT_INT1;
            } else {
                this.int1 = num3;
            }
            Integer num4 = builder.has_lpost;
            if (num4 == null) {
                this.has_lpost = DEFAULT_HAS_LPOST;
            } else {
                this.has_lpost = num4;
            }
            Integer num5 = builder.lpost_type;
            if (num5 == null) {
                this.lpost_type = DEFAULT_LPOST_TYPE;
                return;
            } else {
                this.lpost_type = num5;
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
}
