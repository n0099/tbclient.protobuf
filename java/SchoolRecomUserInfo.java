package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class SchoolRecomUserInfo extends Message {
    public static final String DEFAULT_INSTITUTE = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_UNAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String institute;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_liked;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String uname;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_IS_LIKED = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SchoolRecomUserInfo> {
        public String institute;
        public Integer is_liked;
        public String portrait;
        public Long uid;
        public String uname;

        public Builder() {
        }

        public Builder(SchoolRecomUserInfo schoolRecomUserInfo) {
            super(schoolRecomUserInfo);
            if (schoolRecomUserInfo == null) {
                return;
            }
            this.uid = schoolRecomUserInfo.uid;
            this.uname = schoolRecomUserInfo.uname;
            this.portrait = schoolRecomUserInfo.portrait;
            this.institute = schoolRecomUserInfo.institute;
            this.is_liked = schoolRecomUserInfo.is_liked;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SchoolRecomUserInfo build(boolean z) {
            return new SchoolRecomUserInfo(this, z);
        }
    }

    public SchoolRecomUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.uname;
            if (str == null) {
                this.uname = "";
            } else {
                this.uname = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.institute;
            if (str3 == null) {
                this.institute = "";
            } else {
                this.institute = str3;
            }
            Integer num = builder.is_liked;
            if (num == null) {
                this.is_liked = DEFAULT_IS_LIKED;
                return;
            } else {
                this.is_liked = num;
                return;
            }
        }
        this.uid = builder.uid;
        this.uname = builder.uname;
        this.portrait = builder.portrait;
        this.institute = builder.institute;
        this.is_liked = builder.is_liked;
    }
}
