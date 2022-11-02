package tbclient.FrsPage;

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
public final class RecreationRankInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_RANK_COLOR = "";
    public static final String DEFAULT_RANK_ICON = "";
    public static final String DEFAULT_RANK_LINK = "";
    public static final String DEFAULT_RANK_NAME = "";
    public static final Integer DEFAULT_RANK_SCORE;
    public static final Integer DEFAULT_SHOW_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String rank_color;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String rank_icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rank_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String rank_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank_score;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer show_type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecreationRankInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String icon;
        public String rank_color;
        public String rank_icon;
        public String rank_link;
        public String rank_name;
        public Integer rank_score;
        public Integer show_type;

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
        public Builder(RecreationRankInfo recreationRankInfo) {
            super(recreationRankInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recreationRankInfo};
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
            if (recreationRankInfo == null) {
                return;
            }
            this.icon = recreationRankInfo.icon;
            this.rank_name = recreationRankInfo.rank_name;
            this.rank_score = recreationRankInfo.rank_score;
            this.rank_link = recreationRankInfo.rank_link;
            this.rank_icon = recreationRankInfo.rank_icon;
            this.rank_color = recreationRankInfo.rank_color;
            this.show_type = recreationRankInfo.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecreationRankInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RecreationRankInfo(this, z, null);
            }
            return (RecreationRankInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2050827276, "Ltbclient/FrsPage/RecreationRankInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2050827276, "Ltbclient/FrsPage/RecreationRankInfo;");
                return;
            }
        }
        DEFAULT_RANK_SCORE = 0;
        DEFAULT_SHOW_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecreationRankInfo(Builder builder, boolean z) {
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
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.rank_name;
            if (str2 == null) {
                this.rank_name = "";
            } else {
                this.rank_name = str2;
            }
            Integer num = builder.rank_score;
            if (num == null) {
                this.rank_score = DEFAULT_RANK_SCORE;
            } else {
                this.rank_score = num;
            }
            String str3 = builder.rank_link;
            if (str3 == null) {
                this.rank_link = "";
            } else {
                this.rank_link = str3;
            }
            String str4 = builder.rank_icon;
            if (str4 == null) {
                this.rank_icon = "";
            } else {
                this.rank_icon = str4;
            }
            String str5 = builder.rank_color;
            if (str5 == null) {
                this.rank_color = "";
            } else {
                this.rank_color = str5;
            }
            Integer num2 = builder.show_type;
            if (num2 == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = num2;
                return;
            }
        }
        this.icon = builder.icon;
        this.rank_name = builder.rank_name;
        this.rank_score = builder.rank_score;
        this.rank_link = builder.rank_link;
        this.rank_icon = builder.rank_icon;
        this.rank_color = builder.rank_color;
        this.show_type = builder.show_type;
    }

    public /* synthetic */ RecreationRankInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
