package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FID = 0L;
    public static final Long DEFAULT_OFFSET = 0L;
    public static final Integer DEFAULT_RN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72722common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long offset;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72723common;
        public Long fid;
        public Long offset;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72723common = dataReq.f72722common;
            this.fid = dataReq.fid;
            this.offset = dataReq.offset;
            this.rn = dataReq.rn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f72722common = builder.f72723common;
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Long l2 = builder.offset;
            if (l2 == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = l2;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = num;
                return;
            }
        }
        this.f72722common = builder.f72723common;
        this.fid = builder.fid;
        this.offset = builder.offset;
        this.rn = builder.rn;
    }
}
