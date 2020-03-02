package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1245common;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer from;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_FROM = 0;
    public static final Long DEFAULT_FID = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1245common = builder.f1246common;
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.from == null) {
                this.from = DEFAULT_FROM;
            } else {
                this.from = builder.from;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = builder.fid;
                return;
            }
        }
        this.f1245common = builder.f1246common;
        this.tid = builder.tid;
        this.from = builder.from;
        this.fid = builder.fid;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1246common;
        public Long fid;
        public Integer from;
        public Long tid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1246common = dataReq.f1245common;
                this.tid = dataReq.tid;
                this.from = dataReq.from;
                this.fid = dataReq.fid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
