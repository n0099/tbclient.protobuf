package tbclient.GetPatchInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PatchInfo extends Message {
    public static final String DEFAULT_MAIN_MD5 = "";
    public static final String DEFAULT_MAIN_URL = "";
    public static final String DEFAULT_MAIN_VERSION = "";
    public static final String DEFAULT_PATCH_MD5 = "";
    public static final String DEFAULT_PATCH_NAME = "";
    public static final String DEFAULT_PATCH_URL = "";
    public static final String DEFAULT_PATCH_VERSION = "";
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_need_upgrade;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String main_md5;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long main_size;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String main_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String main_version;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String patch_md5;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String patch_name;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long patch_size;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String patch_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String patch_version;
    public static final Long DEFAULT_PATCH_SIZE = 0L;
    public static final Long DEFAULT_MAIN_SIZE = 0L;
    public static final Integer DEFAULT_IS_NEED_UPGRADE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PatchInfo> {
        public Integer is_need_upgrade;
        public String main_md5;
        public Long main_size;
        public String main_url;
        public String main_version;
        public String patch_md5;
        public String patch_name;
        public Long patch_size;
        public String patch_url;
        public String patch_version;

        public Builder() {
        }

        public Builder(PatchInfo patchInfo) {
            super(patchInfo);
            if (patchInfo == null) {
                return;
            }
            this.patch_name = patchInfo.patch_name;
            this.patch_version = patchInfo.patch_version;
            this.patch_url = patchInfo.patch_url;
            this.patch_md5 = patchInfo.patch_md5;
            this.patch_size = patchInfo.patch_size;
            this.main_version = patchInfo.main_version;
            this.main_url = patchInfo.main_url;
            this.main_md5 = patchInfo.main_md5;
            this.main_size = patchInfo.main_size;
            this.is_need_upgrade = patchInfo.is_need_upgrade;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PatchInfo build(boolean z) {
            return new PatchInfo(this, z);
        }
    }

    public PatchInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.patch_name;
            if (str == null) {
                this.patch_name = "";
            } else {
                this.patch_name = str;
            }
            String str2 = builder.patch_version;
            if (str2 == null) {
                this.patch_version = "";
            } else {
                this.patch_version = str2;
            }
            String str3 = builder.patch_url;
            if (str3 == null) {
                this.patch_url = "";
            } else {
                this.patch_url = str3;
            }
            String str4 = builder.patch_md5;
            if (str4 == null) {
                this.patch_md5 = "";
            } else {
                this.patch_md5 = str4;
            }
            Long l = builder.patch_size;
            if (l == null) {
                this.patch_size = DEFAULT_PATCH_SIZE;
            } else {
                this.patch_size = l;
            }
            String str5 = builder.main_version;
            if (str5 == null) {
                this.main_version = "";
            } else {
                this.main_version = str5;
            }
            String str6 = builder.main_url;
            if (str6 == null) {
                this.main_url = "";
            } else {
                this.main_url = str6;
            }
            String str7 = builder.main_md5;
            if (str7 == null) {
                this.main_md5 = "";
            } else {
                this.main_md5 = str7;
            }
            Long l2 = builder.main_size;
            if (l2 == null) {
                this.main_size = DEFAULT_MAIN_SIZE;
            } else {
                this.main_size = l2;
            }
            Integer num = builder.is_need_upgrade;
            if (num == null) {
                this.is_need_upgrade = DEFAULT_IS_NEED_UPGRADE;
                return;
            } else {
                this.is_need_upgrade = num;
                return;
            }
        }
        this.patch_name = builder.patch_name;
        this.patch_version = builder.patch_version;
        this.patch_url = builder.patch_url;
        this.patch_md5 = builder.patch_md5;
        this.patch_size = builder.patch_size;
        this.main_version = builder.main_version;
        this.main_url = builder.main_url;
        this.main_md5 = builder.main_md5;
        this.main_size = builder.main_size;
        this.is_need_upgrade = builder.is_need_upgrade;
    }
}
