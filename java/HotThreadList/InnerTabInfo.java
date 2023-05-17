package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class InnerTabInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_JUMP_SCHEME = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NOTIFY_VERSION = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer notify_version;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<InnerTabInfo> {
        public String icon;
        public String jump_scheme;
        public String name;
        public Integer notify_version;

        public Builder() {
        }

        public Builder(InnerTabInfo innerTabInfo) {
            super(innerTabInfo);
            if (innerTabInfo == null) {
                return;
            }
            this.name = innerTabInfo.name;
            this.jump_scheme = innerTabInfo.jump_scheme;
            this.icon = innerTabInfo.icon;
            this.notify_version = innerTabInfo.notify_version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InnerTabInfo build(boolean z) {
            return new InnerTabInfo(this, z);
        }
    }

    public InnerTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.jump_scheme;
            if (str2 == null) {
                this.jump_scheme = "";
            } else {
                this.jump_scheme = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            Integer num = builder.notify_version;
            if (num == null) {
                this.notify_version = DEFAULT_NOTIFY_VERSION;
                return;
            } else {
                this.notify_version = num;
                return;
            }
        }
        this.name = builder.name;
        this.jump_scheme = builder.jump_scheme;
        this.icon = builder.icon;
        this.notify_version = builder.notify_version;
    }
}
