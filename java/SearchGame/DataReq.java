package tbclient.SearchGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_QUERY = "";
    @ProtoField(tag = 5)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String query;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer recommend_platform;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    public static final Integer DEFAULT_RECOMMEND_PLATFORM = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
            } else {
                this.recommend_platform = builder.recommend_platform;
            }
            if (builder.query == null) {
                this.query = "";
            } else {
                this.query = builder.query;
            }
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
            this.common = builder.common;
            return;
        }
        this.recommend_platform = builder.recommend_platform;
        this.query = builder.query;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer pn;
        public String query;
        public Integer recommend_platform;
        public Integer rn;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.recommend_platform = dataReq.recommend_platform;
                this.query = dataReq.query;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
