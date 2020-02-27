package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_STATUS = 0;
    public static final String DEFAULT_STATUS_MSG = "";
    @ProtoField(tag = 1)
    public final DrawInfo award_info;
    @ProtoField(tag = 2)
    public final UserChance chance;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String status_msg;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.award_info = builder.award_info;
            this.chance = builder.chance;
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.status_msg == null) {
                this.status_msg = "";
                return;
            } else {
                this.status_msg = builder.status_msg;
                return;
            }
        }
        this.award_info = builder.award_info;
        this.chance = builder.chance;
        this.status = builder.status;
        this.status_msg = builder.status_msg;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public DrawInfo award_info;
        public UserChance chance;
        public Integer status;
        public String status_msg;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.award_info = dataRes.award_info;
                this.chance = dataRes.chance;
                this.status = dataRes.status;
                this.status_msg = dataRes.status_msg;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
