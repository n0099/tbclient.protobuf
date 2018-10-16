package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class MemberShowIcon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    private MemberShowIcon(Builder builder, boolean z) {
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

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<MemberShowIcon> {
        public String icon;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(MemberShowIcon memberShowIcon) {
            super(memberShowIcon);
            if (memberShowIcon != null) {
                this.icon = memberShowIcon.icon;
                this.name = memberShowIcon.name;
                this.url = memberShowIcon.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberShowIcon build(boolean z) {
            return new MemberShowIcon(this, z);
        }
    }
}
