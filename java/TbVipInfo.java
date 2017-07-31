package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    private TbVipInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.v_url == null) {
                this.v_url = "";
            } else {
                this.v_url = builder.v_url;
            }
            if (builder.v_detail == null) {
                this.v_detail = "";
                return;
            } else {
                this.v_detail = builder.v_detail;
                return;
            }
        }
        this.intro = builder.intro;
        this.v_url = builder.v_url;
        this.v_detail = builder.v_detail;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TbVipInfo> {
        public String intro;
        public String v_detail;
        public String v_url;

        public Builder() {
        }

        public Builder(TbVipInfo tbVipInfo) {
            super(tbVipInfo);
            if (tbVipInfo != null) {
                this.intro = tbVipInfo.intro;
                this.v_url = tbVipInfo.v_url;
                this.v_detail = tbVipInfo.v_detail;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbVipInfo build(boolean z) {
            return new TbVipInfo(this, z);
        }
    }
}
