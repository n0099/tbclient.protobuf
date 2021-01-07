package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14808common;
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
            this.f14808common = builder.f14809common;
            return;
        }
        this.game_id = builder.game_id;
        this.f14808common = builder.f14809common;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14809common;
        public String game_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.game_id = dataReq.game_id;
                this.f14809common = dataReq.f14808common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
