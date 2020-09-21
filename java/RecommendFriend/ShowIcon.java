package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes20.dex */
public final class ShowIcon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    private ShowIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.url = builder.url;
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<ShowIcon> {
        public String icon;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(ShowIcon showIcon) {
            super(showIcon);
            if (showIcon != null) {
                this.icon = showIcon.icon;
                this.name = showIcon.name;
                this.url = showIcon.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShowIcon build(boolean z) {
            return new ShowIcon(this, z);
        }
    }
}
