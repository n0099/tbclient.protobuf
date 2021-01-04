package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    private BirthdayInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.birthday_time == null) {
                this.birthday_time = DEFAULT_BIRTHDAY_TIME;
            } else {
                this.birthday_time = builder.birthday_time;
            }
            if (builder.birthday_show_status == null) {
                this.birthday_show_status = DEFAULT_BIRTHDAY_SHOW_STATUS;
            } else {
                this.birthday_show_status = builder.birthday_show_status;
            }
            if (builder.constellation == null) {
                this.constellation = "";
            } else {
                this.constellation = builder.constellation;
            }
            if (builder.age == null) {
                this.age = DEFAULT_AGE;
                return;
            } else {
                this.age = builder.age;
                return;
            }
        }
        this.birthday_time = builder.birthday_time;
        this.birthday_show_status = builder.birthday_show_status;
        this.constellation = builder.constellation;
        this.age = builder.age;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BirthdayInfo> {
        public Integer age;
        public Integer birthday_show_status;
        public Long birthday_time;
        public String constellation;

        public Builder() {
        }

        public Builder(BirthdayInfo birthdayInfo) {
            super(birthdayInfo);
            if (birthdayInfo != null) {
                this.birthday_time = birthdayInfo.birthday_time;
                this.birthday_show_status = birthdayInfo.birthday_show_status;
                this.constellation = birthdayInfo.constellation;
                this.age = birthdayInfo.age;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BirthdayInfo build(boolean z) {
            return new BirthdayInfo(this, z);
        }
    }
}
