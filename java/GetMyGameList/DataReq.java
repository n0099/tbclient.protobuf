package tbclient.GetMyGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer recommend_platform;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rn;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_RECOMMEND_PLATFORM = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
                return;
            } else {
                this.recommend_platform = builder.recommend_platform;
                return;
            }
        }
        this.common = builder.common;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.recommend_platform = builder.recommend_platform;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer pn;
        public Integer recommend_platform;
        public Integer rn;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.recommend_platform = dataReq.recommend_platform;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
