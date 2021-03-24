package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68503common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68504common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68504common = dataReq.f68503common;
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
            this.f68503common = builder.f68504common;
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
                return;
            } else {
                this.scene_from = str;
                return;
            }
        }
        this.f68503common = builder.f68504common;
        this.scene_from = builder.scene_from;
    }
}
