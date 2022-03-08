package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class SeniorLottery extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACT_DESC = "";
    public static final List<LotteryRegular> DEFAULT_ACT_REGULAR;
    public static final List<AwardInfo> DEFAULT_AWARD_INFO;
    public static final List<AwardUser> DEFAULT_LUCK_USERS;
    public static final String DEFAULT_MYAWARD = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String act_desc;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<LotteryRegular> act_regular;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<AwardInfo> award_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<AwardUser> luck_users;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String myaward;
    @ProtoField(tag = 1)
    public final LotteryTheme theme;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SeniorLottery> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String act_desc;
        public List<LotteryRegular> act_regular;
        public List<AwardInfo> award_info;
        public List<AwardUser> luck_users;
        public String myaward;
        public LotteryTheme theme;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(SeniorLottery seniorLottery) {
            super(seniorLottery);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {seniorLottery};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (seniorLottery == null) {
                return;
            }
            this.theme = seniorLottery.theme;
            this.award_info = Message.copyOf(seniorLottery.award_info);
            this.myaward = seniorLottery.myaward;
            this.luck_users = Message.copyOf(seniorLottery.luck_users);
            this.act_desc = seniorLottery.act_desc;
            this.act_regular = Message.copyOf(seniorLottery.act_regular);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SeniorLottery build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SeniorLottery(this, z, null) : (SeniorLottery) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(110930892, "Ltbclient/SeniorLottery;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(110930892, "Ltbclient/SeniorLottery;");
                return;
            }
        }
        DEFAULT_AWARD_INFO = Collections.emptyList();
        DEFAULT_LUCK_USERS = Collections.emptyList();
        DEFAULT_ACT_REGULAR = Collections.emptyList();
    }

    public /* synthetic */ SeniorLottery(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeniorLottery(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            this.theme = builder.theme;
            List<AwardInfo> list = builder.award_info;
            if (list == null) {
                this.award_info = DEFAULT_AWARD_INFO;
            } else {
                this.award_info = Message.immutableCopyOf(list);
            }
            String str = builder.myaward;
            if (str == null) {
                this.myaward = "";
            } else {
                this.myaward = str;
            }
            List<AwardUser> list2 = builder.luck_users;
            if (list2 == null) {
                this.luck_users = DEFAULT_LUCK_USERS;
            } else {
                this.luck_users = Message.immutableCopyOf(list2);
            }
            String str2 = builder.act_desc;
            if (str2 == null) {
                this.act_desc = "";
            } else {
                this.act_desc = str2;
            }
            List<LotteryRegular> list3 = builder.act_regular;
            if (list3 == null) {
                this.act_regular = DEFAULT_ACT_REGULAR;
                return;
            } else {
                this.act_regular = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.theme = builder.theme;
        this.award_info = Message.immutableCopyOf(builder.award_info);
        this.myaward = builder.myaward;
        this.luck_users = Message.immutableCopyOf(builder.luck_users);
        this.act_desc = builder.act_desc;
        this.act_regular = Message.immutableCopyOf(builder.act_regular);
    }
}
