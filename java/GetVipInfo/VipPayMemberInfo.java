package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipPayMemberInfo extends Message {
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer now_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer props_id;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_NOW_TIME = 0;

    private VipPayMemberInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.now_time == null) {
                this.now_time = DEFAULT_NOW_TIME;
                return;
            } else {
                this.now_time = builder.now_time;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
        this.pic_url = builder.pic_url;
        this.now_time = builder.now_time;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipPayMemberInfo> {
        public Integer end_time;
        public Integer now_time;
        public String pic_url;
        public Integer props_id;

        public Builder() {
        }

        public Builder(VipPayMemberInfo vipPayMemberInfo) {
            super(vipPayMemberInfo);
            if (vipPayMemberInfo != null) {
                this.props_id = vipPayMemberInfo.props_id;
                this.end_time = vipPayMemberInfo.end_time;
                this.pic_url = vipPayMemberInfo.pic_url;
                this.now_time = vipPayMemberInfo.now_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipPayMemberInfo build(boolean z) {
            return new VipPayMemberInfo(this, z);
        }
    }
}
