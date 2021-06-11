package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ActiveBannerList extends Message {
    public static final String DEFAULT_ACTIVE_DESC = "";
    public static final String DEFAULT_ACTIVE_NAME = "";
    public static final String DEFAULT_ACTIVE_URL = "";
    public static final String DEFAULT_SKIP_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String active_desc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String active_name;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer active_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String skip_url;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_ACTIVE_TYPE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ActiveBannerList> {
        public String active_desc;
        public String active_name;
        public Integer active_type;
        public String active_url;
        public Integer id;
        public String skip_url;

        public Builder() {
        }

        public Builder(ActiveBannerList activeBannerList) {
            super(activeBannerList);
            if (activeBannerList == null) {
                return;
            }
            this.id = activeBannerList.id;
            this.active_name = activeBannerList.active_name;
            this.active_url = activeBannerList.active_url;
            this.active_desc = activeBannerList.active_desc;
            this.skip_url = activeBannerList.skip_url;
            this.active_type = activeBannerList.active_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveBannerList build(boolean z) {
            return new ActiveBannerList(this, z);
        }
    }

    public ActiveBannerList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.active_name;
            if (str == null) {
                this.active_name = "";
            } else {
                this.active_name = str;
            }
            String str2 = builder.active_url;
            if (str2 == null) {
                this.active_url = "";
            } else {
                this.active_url = str2;
            }
            String str3 = builder.active_desc;
            if (str3 == null) {
                this.active_desc = "";
            } else {
                this.active_desc = str3;
            }
            String str4 = builder.skip_url;
            if (str4 == null) {
                this.skip_url = "";
            } else {
                this.skip_url = str4;
            }
            Integer num2 = builder.active_type;
            if (num2 == null) {
                this.active_type = DEFAULT_ACTIVE_TYPE;
                return;
            } else {
                this.active_type = num2;
                return;
            }
        }
        this.id = builder.id;
        this.active_name = builder.active_name;
        this.active_url = builder.active_url;
        this.active_desc = builder.active_desc;
        this.skip_url = builder.skip_url;
        this.active_type = builder.active_type;
    }
}
