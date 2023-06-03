package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DealAuthInfo extends Message {
    public static final String DEFAULT_ITEM_CONTENT = "";
    public static final String DEFAULT_ITEM_NAME = "";
    public static final String DEFAULT_ITEM_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String item_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String item_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String item_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DealAuthInfo> {
        public String item_content;
        public String item_name;
        public String item_url;

        public Builder() {
        }

        public Builder(DealAuthInfo dealAuthInfo) {
            super(dealAuthInfo);
            if (dealAuthInfo == null) {
                return;
            }
            this.item_name = dealAuthInfo.item_name;
            this.item_content = dealAuthInfo.item_content;
            this.item_url = dealAuthInfo.item_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DealAuthInfo build(boolean z) {
            return new DealAuthInfo(this, z);
        }
    }

    public DealAuthInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.item_name;
            if (str == null) {
                this.item_name = "";
            } else {
                this.item_name = str;
            }
            String str2 = builder.item_content;
            if (str2 == null) {
                this.item_content = "";
            } else {
                this.item_content = str2;
            }
            String str3 = builder.item_url;
            if (str3 == null) {
                this.item_url = "";
                return;
            } else {
                this.item_url = str3;
                return;
            }
        }
        this.item_name = builder.item_name;
        this.item_content = builder.item_content;
        this.item_url = builder.item_url;
    }
}
