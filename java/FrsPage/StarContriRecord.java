package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class StarContriRecord extends Message {
    public static final String DEFAULT_RECORD_NOTICE = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String record_notice;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StarContriRecord> {
        public String record_notice;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(StarContriRecord starContriRecord) {
            super(starContriRecord);
            if (starContriRecord == null) {
                return;
            }
            this.user_id = starContriRecord.user_id;
            this.user_name = starContriRecord.user_name;
            this.record_notice = starContriRecord.record_notice;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarContriRecord build(boolean z) {
            return new StarContriRecord(this, z);
        }
    }

    public StarContriRecord(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.record_notice;
            if (str2 == null) {
                this.record_notice = "";
                return;
            } else {
                this.record_notice = str2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.record_notice = builder.record_notice;
    }
}
