package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69514common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69515common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69515common = dataReq.f69514common;
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
            this.f69514common = builder.f69515common;
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
                return;
            } else {
                this.scene_from = str;
                return;
            }
        }
        this.f69514common = builder.f69515common;
        this.scene_from = builder.scene_from;
    }
}
