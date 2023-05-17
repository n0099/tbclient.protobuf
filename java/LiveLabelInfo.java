package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LiveLabelInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LiveLabelInfo> {
        public String icon;
        public String name;

        public Builder() {
        }

        public Builder(LiveLabelInfo liveLabelInfo) {
            super(liveLabelInfo);
            if (liveLabelInfo == null) {
                return;
            }
            this.name = liveLabelInfo.name;
            this.icon = liveLabelInfo.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveLabelInfo build(boolean z) {
            return new LiveLabelInfo(this, z);
        }
    }

    public LiveLabelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
    }
}
