package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FID = 0L;
    public static final Long DEFAULT_OFFSET = 0L;
    public static final Integer DEFAULT_RN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1294common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long offset;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1295common;
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
            this.f1295common = dataReq.f1294common;
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
            this.f1294common = builder.f1295common;
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
        this.f1294common = builder.f1295common;
        this.fid = builder.fid;
        this.offset = builder.offset;
        this.rn = builder.rn;
    }
}
