package tbclient.GetInfluenceRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_NAME = "";
    @ProtoField(tag = 6)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1343common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_name;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_PN = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1344common;
        public Long forum_id;
        public Integer pn;
        public Integer rn;
        public String tieba_name;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.tieba_name = dataReq.tieba_name;
            this.forum_id = dataReq.forum_id;
            this.rn = dataReq.rn;
            this.pn = dataReq.pn;
            this.f1344common = dataReq.f1343common;
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
            String str = builder.tieba_name;
            if (str == null) {
                this.tieba_name = "";
            } else {
                this.tieba_name = str;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            this.f1343common = builder.f1344common;
            return;
        }
        this.tieba_name = builder.tieba_name;
        this.forum_id = builder.forum_id;
        this.rn = builder.rn;
        this.pn = builder.pn;
        this.f1343common = builder.f1344common;
    }
}
