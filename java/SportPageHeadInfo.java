package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SportPageHeadInfo extends Message {
    public static final String DEFAULT_HEAD_URL = "";
    public static final Integer DEFAULT_IS_AD = 0;
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String head_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_ad;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SportPageHeadInfo> {
        public String head_url;
        public Integer is_ad;
        public String jump_url;

        public Builder() {
        }

        public Builder(SportPageHeadInfo sportPageHeadInfo) {
            super(sportPageHeadInfo);
            if (sportPageHeadInfo == null) {
                return;
            }
            this.head_url = sportPageHeadInfo.head_url;
            this.is_ad = sportPageHeadInfo.is_ad;
            this.jump_url = sportPageHeadInfo.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SportPageHeadInfo build(boolean z) {
            return new SportPageHeadInfo(this, z);
        }
    }

    public SportPageHeadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.head_url;
            if (str == null) {
                this.head_url = "";
            } else {
                this.head_url = str;
            }
            Integer num = builder.is_ad;
            if (num == null) {
                this.is_ad = DEFAULT_IS_AD;
            } else {
                this.is_ad = num;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str2;
                return;
            }
        }
        this.head_url = builder.head_url;
        this.is_ad = builder.is_ad;
        this.jump_url = builder.jump_url;
    }
}
