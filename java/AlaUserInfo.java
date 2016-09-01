package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AlaUserInfo extends Message {
    public static final Long DEFAULT_ALA_ID = 0L;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SEX = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long ala_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String sex;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* synthetic */ AlaUserInfo(Builder builder, boolean z, AlaUserInfo alaUserInfo) {
        this(builder, z);
    }

    private AlaUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ala_id == null) {
                this.ala_id = DEFAULT_ALA_ID;
            } else {
                this.ala_id = builder.ala_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
            }
            if (builder.sex == null) {
                this.sex = "";
                return;
            } else {
                this.sex = builder.sex;
                return;
            }
        }
        this.ala_id = builder.ala_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.description = builder.description;
        this.sex = builder.sex;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AlaUserInfo> {
        public Long ala_id;
        public String description;
        public String portrait;
        public String sex;
        public String user_name;

        public Builder() {
        }

        public Builder(AlaUserInfo alaUserInfo) {
            super(alaUserInfo);
            if (alaUserInfo != null) {
                this.ala_id = alaUserInfo.ala_id;
                this.user_name = alaUserInfo.user_name;
                this.portrait = alaUserInfo.portrait;
                this.description = alaUserInfo.description;
                this.sex = alaUserInfo.sex;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaUserInfo build(boolean z) {
            return new AlaUserInfo(this, z, null);
        }
    }
}
