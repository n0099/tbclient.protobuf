package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14591common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14591common = builder.f14592common;
            if (builder.scene_from == null) {
                this.scene_from = "";
                return;
            } else {
                this.scene_from = builder.scene_from;
                return;
            }
        }
        this.f14591common = builder.f14592common;
        this.scene_from = builder.scene_from;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14592common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14592common = dataReq.f14591common;
                this.scene_from = dataReq.scene_from;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
