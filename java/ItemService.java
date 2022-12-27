package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ItemService extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer app_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer client_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_CLIENT_TYPE = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_APP_ID = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemService> {
        public Integer app_id;
        public Integer client_type;
        public String icon;
        public String name;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(ItemService itemService) {
            super(itemService);
            if (itemService == null) {
                return;
            }
            this.icon = itemService.icon;
            this.client_type = itemService.client_type;
            this.type = itemService.type;
            this.name = itemService.name;
            this.url = itemService.url;
            this.app_id = itemService.app_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemService build(boolean z) {
            return new ItemService(this, z);
        }
    }

    public ItemService(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            Integer num = builder.client_type;
            if (num == null) {
                this.client_type = DEFAULT_CLIENT_TYPE;
            } else {
                this.client_type = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            Integer num3 = builder.app_id;
            if (num3 == null) {
                this.app_id = DEFAULT_APP_ID;
                return;
            } else {
                this.app_id = num3;
                return;
            }
        }
        this.icon = builder.icon;
        this.client_type = builder.client_type;
        this.type = builder.type;
        this.name = builder.name;
        this.url = builder.url;
        this.app_id = builder.app_id;
    }
}
