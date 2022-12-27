package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class BirthdayInfo extends Message {
    public static final String DEFAULT_CONSTELLATION = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer age;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer birthday_show_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long birthday_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String constellation;
    public static final Long DEFAULT_BIRTHDAY_TIME = 0L;
    public static final Integer DEFAULT_BIRTHDAY_SHOW_STATUS = 0;
    public static final Integer DEFAULT_AGE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BirthdayInfo> {
        public Integer age;
        public Integer birthday_show_status;
        public Long birthday_time;
        public String constellation;

        public Builder() {
        }

        public Builder(BirthdayInfo birthdayInfo) {
            super(birthdayInfo);
            if (birthdayInfo == null) {
                return;
            }
            this.birthday_time = birthdayInfo.birthday_time;
            this.birthday_show_status = birthdayInfo.birthday_show_status;
            this.constellation = birthdayInfo.constellation;
            this.age = birthdayInfo.age;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BirthdayInfo build(boolean z) {
            return new BirthdayInfo(this, z);
        }
    }

    public BirthdayInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.birthday_time;
            if (l == null) {
                this.birthday_time = DEFAULT_BIRTHDAY_TIME;
            } else {
                this.birthday_time = l;
            }
            Integer num = builder.birthday_show_status;
            if (num == null) {
                this.birthday_show_status = DEFAULT_BIRTHDAY_SHOW_STATUS;
            } else {
                this.birthday_show_status = num;
            }
            String str = builder.constellation;
            if (str == null) {
                this.constellation = "";
            } else {
                this.constellation = str;
            }
            Integer num2 = builder.age;
            if (num2 == null) {
                this.age = DEFAULT_AGE;
                return;
            } else {
                this.age = num2;
                return;
            }
        }
        this.birthday_time = builder.birthday_time;
        this.birthday_show_status = builder.birthday_show_status;
        this.constellation = builder.constellation;
        this.age = builder.age;
    }
}
