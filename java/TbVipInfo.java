package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class TbVipInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_V_DETAIL = "";
    public static final String DEFAULT_V_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String v_detail;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String v_url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TbVipInfo> {
        public String intro;
        public String v_detail;
        public String v_url;

        public Builder() {
        }

        public Builder(TbVipInfo tbVipInfo) {
            super(tbVipInfo);
            if (tbVipInfo == null) {
                return;
            }
            this.intro = tbVipInfo.intro;
            this.v_url = tbVipInfo.v_url;
            this.v_detail = tbVipInfo.v_detail;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbVipInfo build(boolean z) {
            return new TbVipInfo(this, z);
        }
    }

    public TbVipInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.intro;
            if (str == null) {
                this.intro = "";
            } else {
                this.intro = str;
            }
            String str2 = builder.v_url;
            if (str2 == null) {
                this.v_url = "";
            } else {
                this.v_url = str2;
            }
            String str3 = builder.v_detail;
            if (str3 == null) {
                this.v_detail = "";
                return;
            } else {
                this.v_detail = str3;
                return;
            }
        }
        this.intro = builder.intro;
        this.v_url = builder.v_url;
        this.v_detail = builder.v_detail;
    }
}
