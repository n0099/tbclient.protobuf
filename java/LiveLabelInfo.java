package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class LiveLabelInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    private LiveLabelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon == null) {
                this.icon = "";
                return;
            } else {
                this.icon = builder.icon;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<LiveLabelInfo> {
        public String icon;
        public String name;

        public Builder() {
        }

        public Builder(LiveLabelInfo liveLabelInfo) {
            super(liveLabelInfo);
            if (liveLabelInfo != null) {
                this.name = liveLabelInfo.name;
                this.icon = liveLabelInfo.icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveLabelInfo build(boolean z) {
            return new LiveLabelInfo(this, z);
        }
    }
}
