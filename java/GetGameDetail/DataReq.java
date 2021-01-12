package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14511common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            this.f14511common = builder.f14512common;
            return;
        }
        this.game_id = builder.game_id;
        this.f14511common = builder.f14512common;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14512common;
        public String game_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.game_id = dataReq.game_id;
                this.f14512common = dataReq.f14511common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
