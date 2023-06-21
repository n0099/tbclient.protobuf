package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1410common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1411common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1411common = dataReq.f1410common;
            this.scene_from = dataReq.scene_from;
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
            this.f1410common = builder.f1411common;
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
                return;
            } else {
                this.scene_from = str;
                return;
            }
        }
        this.f1410common = builder.f1411common;
        this.scene_from = builder.scene_from;
    }
}
