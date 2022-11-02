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
/* loaded from: classes9.dex */
public final class AwardInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AWARD_ACT_ID;
    public static final Long DEFAULT_AWARD_ID;
    public static final String DEFAULT_AWARD_IMGSRC = "";
    public static final String DEFAULT_AWARD_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long award_act_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long award_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String award_imgsrc;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_name;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AwardInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long award_act_id;
        public Long award_id;
        public String award_imgsrc;
        public String award_name;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(AwardInfo awardInfo) {
            super(awardInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {awardInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (awardInfo == null) {
                return;
            }
            this.award_id = awardInfo.award_id;
            this.award_act_id = awardInfo.award_act_id;
            this.award_name = awardInfo.award_name;
            this.award_imgsrc = awardInfo.award_imgsrc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AwardInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new AwardInfo(this, z, null);
            }
            return (AwardInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1657091418, "Ltbclient/AwardInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1657091418, "Ltbclient/AwardInfo;");
                return;
            }
        }
        DEFAULT_AWARD_ID = 0L;
        DEFAULT_AWARD_ACT_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwardInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.award_id;
            if (l == null) {
                this.award_id = DEFAULT_AWARD_ID;
            } else {
                this.award_id = l;
            }
            Long l2 = builder.award_act_id;
            if (l2 == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = l2;
            }
            String str = builder.award_name;
            if (str == null) {
                this.award_name = "";
            } else {
                this.award_name = str;
            }
            String str2 = builder.award_imgsrc;
            if (str2 == null) {
                this.award_imgsrc = "";
                return;
            } else {
                this.award_imgsrc = str2;
                return;
            }
        }
        this.award_id = builder.award_id;
        this.award_act_id = builder.award_act_id;
        this.award_name = builder.award_name;
        this.award_imgsrc = builder.award_imgsrc;
    }

    public /* synthetic */ AwardInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
