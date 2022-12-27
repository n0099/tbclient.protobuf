package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SugLiveInfo extends Message {
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 2)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String word;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SugLiveInfo> {
        public AlaLiveInfo ala_info;
        public String word;

        public Builder() {
        }

        public Builder(SugLiveInfo sugLiveInfo) {
            super(sugLiveInfo);
            if (sugLiveInfo == null) {
                return;
            }
            this.word = sugLiveInfo.word;
            this.ala_info = sugLiveInfo.ala_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SugLiveInfo build(boolean z) {
            return new SugLiveInfo(this, z);
        }
    }

    public SugLiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.word;
            if (str == null) {
                this.word = "";
            } else {
                this.word = str;
            }
            this.ala_info = builder.ala_info;
            return;
        }
        this.word = builder.word;
        this.ala_info = builder.ala_info;
    }
}
