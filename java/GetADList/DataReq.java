package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes6.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FID = 0L;
    public static final Long DEFAULT_OFFSET = 0L;
    public static final Integer DEFAULT_RN = 0;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long offset;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.offset == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = builder.offset;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = builder.rn;
                return;
            }
        }
        this.common = builder.common;
        this.fid = builder.fid;
        this.offset = builder.offset;
        this.rn = builder.rn;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long fid;
        public Long offset;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.fid = dataReq.fid;
                this.offset = dataReq.offset;
                this.rn = dataReq.rn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
