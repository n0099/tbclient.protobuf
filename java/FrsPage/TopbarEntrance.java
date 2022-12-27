package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TopbarEntrance extends Message {
    public static final String DEFAULT_GUIDE_TIP_FIRST_TEXT = "";
    public static final String DEFAULT_GUIDE_TIP_TEXT = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String guide_tip_first_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String guide_tip_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TopbarEntrance> {
        public String guide_tip_first_text;
        public String guide_tip_text;
        public String jump_url;

        public Builder() {
        }

        public Builder(TopbarEntrance topbarEntrance) {
            super(topbarEntrance);
            if (topbarEntrance == null) {
                return;
            }
            this.guide_tip_first_text = topbarEntrance.guide_tip_first_text;
            this.guide_tip_text = topbarEntrance.guide_tip_text;
            this.jump_url = topbarEntrance.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopbarEntrance build(boolean z) {
            return new TopbarEntrance(this, z);
        }
    }

    public TopbarEntrance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.guide_tip_first_text;
            if (str == null) {
                this.guide_tip_first_text = "";
            } else {
                this.guide_tip_first_text = str;
            }
            String str2 = builder.guide_tip_text;
            if (str2 == null) {
                this.guide_tip_text = "";
            } else {
                this.guide_tip_text = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str3;
                return;
            }
        }
        this.guide_tip_first_text = builder.guide_tip_first_text;
        this.guide_tip_text = builder.guide_tip_text;
        this.jump_url = builder.jump_url;
    }
}
