package tbclient.Acrossaward;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AWARD_TYPE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String award_type;
    @ProtoField(tag = 1)
    public final CommonReq common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.award_type == null) {
                this.award_type = "";
                return;
            } else {
                this.award_type = builder.award_type;
                return;
            }
        }
        this.common = builder.common;
        this.award_type = builder.award_type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String award_type;
        public CommonReq common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.award_type = dataReq.award_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
